Dim objExcel
Dim folderName
folderName = "."
Dim fullpath
Dim fso
Dim strFile

Set fso = CreateObject("Scripting.FileSystemObject")
fullpath = fso.GetAbsolutePathName(folderName)

Set objShell = CreateObject("WScript.Shell")
userProfilePath = objShell.ExpandEnvironmentStrings("%UserProfile%")

strFile = userProfilePath + "\Downloads\sites-and-homepages"
Set objExcel = wscript.CreateObject("Excel.Application")
objExcel.Visible = True

Set objWorkbook1= objExcel.Workbooks.Open(fullpath & "\test.xlsx")
Set worksheet1=objWorkbook1.Worksheets("1")
Set worksheet2=objWorkbook1.Worksheets("2")
Set worksheet3=objWorkbook1.Worksheets("3")
worksheet3.Activate
worksheet3.UsedRange.ClearContents
worksheet2.Activate
worksheet2.Move objWorkbook1.Worksheets(1)
worksheet1.Activate
worksheet1.UsedRange.ClearContents
With worksheet1.QueryTables.Add("TEXT;" & strFile, worksheet1.Range("A1"))
    .TextFileCommaDelimiter = False
    .Refresh
End With
worksheet3.Activate
worksheet1.Name =   worksheet1.Name & "_v1"
worksheet2.Name =  "1"
worksheet1.Name =  "2"

For Each mycell In objWorkbook1.Worksheets("1").UsedRange
If Not mycell.Value =objWorkbook1.Worksheets("2").Cells(mycell.Row, mycell.Column).Value Then
mycell.Interior.Color = vbYellow 
objWorkbook1.Worksheets("3").Cells(mycell.Row, mycell.Column).Value ="1:" + mycell.Value + "2:" + objWorkbook1.Worksheets("2").Cells(mycell.Row, mycell.Column).Value
Else
mycell.Interior.ColorIndex = 0
End If
Next
objWorkbook1.Save
objExcel.Quit
set objExcel=nothing 
