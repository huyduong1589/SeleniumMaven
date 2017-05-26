Browser Capabilities:
1. Browser name
- -Dbrowser=firefox
- -Dbrowser=chrome
- -Dbrowser=browser
- -Dbrowser=ie
- -Dbrowser=opera
- -Dbrowser=htmlunit
- -Dbrowser=phantomjs

2. Browser version
- -DbrowserVersion=43

3. Platform
- -Dplatform=XP
- -Dplatform=WINDOWS
- -Dplatform=LINUX
- -Dplatform=IOS
- -Dplatform=ANDROID

Appium Capabilities:

1. Device Name
- -DdeviceName="iPhone Simulator"

2. App (absolute path)
- -Dapp="test.apk"

3. Android AppPackage
- -DappPackage="com.example.android.contactmanager"

4. Android AppActivity
- -DappActivity=".ContactManager"

Remote:
- -Dremote=true 
- -DseleniumGridURL=http://10.1.0.102/wd/hub


Multi threads support:
- -Dthreads=5

Proxy support
- -DproxyEnabled=true
- -DproxyHost=localhost
- -DproxyPort=8080

Retry support (when initiate web driver):
- -DretryCnt=10
- -DretryTimer=10

Rerun failed test cases (get latest result):
- -DretryOnFail=1

Suite name (in folder suites/)
- -DsuiteName=demo

Screenshots dir:
${project.basedir}/target/screenshots

If you need to force a binary overwrite you can do:
- -Doverwrite.binaries=true

### It's not working!!!
You have probably got outdated driver binaries, by default they are not overwritten if they already exist to speed things up.  You have two options:

- mvn clean verify -Doverwrite.binaries=true
- Delete the selenium_standalone_binaries folder in your resources directory
