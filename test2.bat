@echo off

:: Fetch param1
set "param1=%~1"
goto :param1Check
:param1Prompt
set /p "param1=Enter parameter 1: "
:param1Check
if "%param1%"=="" goto :param1Prompt

:: Fetch param2    
set "param2=%~2"
goto :param2Check
:param2Prompt
set /p "param2=Enter parameter 2: "
:param2Check
if "%param2%"=="" goto :param2Prompt

:: Process the params
echo param1=%param1%
echo param2=%param2%