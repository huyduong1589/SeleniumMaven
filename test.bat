@echo off
:: Fetch remote or local
set "remote=%~1"
echo %remote%
goto :defineEnv
:defineEnv
IF "%remote%"=="local" ( set envRemote="false" )
IF "%remote%"=="remote" ( set envRemote="true" )
echo REMOTE: %envRemote%

:: Fetch browser
set "browser=%~2"
echo BROWSER: %browser%

:: Fetch version
set "version=%~3"
echo VERSION: %version%

:: Fetch suite
set "suite=%~4"
echo SUITE: %suite%

cd \TA\automationFW\myinstall\automationFW\workspace\SeleniumMaven\
mvn verify -Dremote=%envRemote% -Dbrowser=%browser% -DretryOnfail=0 -Dthreads=1 -Dsuite=%suite% -DseleniumGridURL="http://137.116.158.110:4444/wd/hub" -Dplatform="WINDOWS" -DbrowserVersion=%version%