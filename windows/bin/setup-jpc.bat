@echo off

for %%X in (jpc.bat) do (set FOUND=%%~$PATH:X)

if not defined FOUND setx PATH "%PATH%;%cd%"