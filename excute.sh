mvn clean -DsuiteName=demoRestTest verify
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=chrome -DbrowserVersion=47 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=firefox -DbrowserVersion=43 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=ie -DbrowserVersion=8 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=safari -DbrowserVersion=5 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=MAC -Dbrowser=safari -DbrowserVersion=8.08 -Dscreenshot=/var/screenshot/java -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
# Android
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dbrowser=chrome -DbrowserVersion=6.0.0 -Dplatform=Android -DdeviceName="Sony" -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 verify

mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dbrowser=Safari -DbrowserVersion=8.4 -DplatformName=iOS -DplatformVersion=8.4 -DdeviceName="iPhone Simulator" -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 verify

mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dbrowser=Safari -DbrowserVersion=9.2 -DplatformName=iOS -DplatformVersion=9.2 -DdeviceName="iPhone Simulator" -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 verify

mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=LINUX -Dbrowser=phantomjs -DbrowserVersion=2.1.1headless_huan -Dscreenshot=/var/screenshot/java -DproxyEnabled=true -DproxyHost=10.10.10.10 -DproxyPort=8080  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify

mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=LINUX -Dbrowser=firefox -DbrowserVersion=44headless_huan -Dscreenshot=/var/screenshot/java -DproxyEnabled=true -DproxyHost=10.10.10.10 -DproxyPort=8080  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify

mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=LINUX -Dbrowser=chrome -DbrowserVersion=48headless_huan -Dscreenshot=/var/screenshot/java -DproxyEnabled=true -DproxyHost=10.10.10.10 -DproxyPort=8080  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=5 verify
#Native Android demo
mvn clean -Dremote=true -DseleniumGridURL=http://192.168.35.58:4700/wd/hub -Dbrowser=native -DbrowserVersion=6.0 -Dplatform=Android -DplatformName=Android -DdeviceName="Sony" -DplatformVersion=6.0 -Dapp=http://10.1.0.102/upload/app-release.apk  -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=demonativeandroid verify

#Demo Page Object
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=chrome -DbrowserVersion=47 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=demopageobject verify
# CLI test
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=chrome -DbrowserVersion=47 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=cli verify
# Demo data provider
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=WINDOWS -Dbrowser=chrome -DbrowserVersion=47win71 -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=dataproviderdemo verify
# IOS
mvn clean -Dremote=true -DseleniumGridURL=http://10.1.0.102/wd/hub -Dplatform=MAC -DplatformName=iOS -Dbrowser=safari -DbrowserVersion=8.4 -DplatformVersion=8.4 -DdeviceName="iPhone Simulator" -Dscreenshot=/var/screenshot/jav -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=dataproviderdemo verify
mvn clean -Dremote=true -DseleniumGridURL=http://192.168.35.58:4700/wd/hub -Dbrowser=native -DbrowserVersion=6.0 -Dplatform=Android -DplatformName=Android -DdeviceName="Sony" -DplatformVersion=6.0 -Dapp=http://10.1.0.102/upload/app-release.apk  -Dscreenshot=/var/screenshot/java  -DretryCnt=5 -DretryTimer=10 -DretryOnFail=1 -Dthreads=1 -DsuiteName=dataproviderdemo verify
