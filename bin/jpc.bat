java -jar %~dp0jpc.jar %cd% %1 %2

set javaExitCode=%ERRORLEVEL%

if %javaExitCode%==0 goto folderAndFileCreated
if %javaExitCode%==1 goto folderCreated
if %javaExitCode%==2 goto nothingCreated

:folderAndFileCreated
cd %1
code .

:folderCreated
cd %1

:nothingCreated
pause