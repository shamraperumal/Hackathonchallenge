Dim FSO
Dim FileName
Set objShell = CreateObject("WScript.Shell")
userProfilePath = objShell.ExpandEnvironmentStrings("%UserProfile%")
FileName = userProfilePath + "\Downloads\sites-and-homepages"
Set FSO = wscript.CreateObject("Scripting.FileSystemObject")
If FSO.FileExists(FileName) Then 
FSO.DeleteFile FileName
End If

