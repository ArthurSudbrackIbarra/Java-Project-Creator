@echo off

java -jar %~dp0jpc.jar %cd% %1 %2

set JAVA_EXIT_CODE=%ERRORLEVEL%

if %JAVA_EXIT_CODE%==0 goto folderAndFileCreated
if %JAVA_EXIT_CODE%==1 goto folderCreated

pause

:folderAndFileCreated
cd %1
code .

:folderCreated
cd %1