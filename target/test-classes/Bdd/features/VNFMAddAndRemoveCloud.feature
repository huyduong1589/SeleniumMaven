@VNFM_Add_and_Remove_Cloud
Feature: Add and Remove a cloud on VNFM
  Users add and remove a cloud on VNFM with all fields are full filled 

Scenario: Add a cloud on VNFM
  Given I navigate to page at "http://10.250.40.50:8080/CloudMgr" address
  When I login with username is "dmhuy" and password is "password"
  When I go to VNF Settings Page
  When I add a new cloud with name "Automation" keystone "10.10.10.10" nova "10.10.10.10" neutron "10.10.10.10" cinder "10.10.10.10" glance "10.10.10.10" geo name "TMA" and geo location "53.123456, -50.123321" 
  Then I can search and see "Automation" cloud
  When I remove "Automation" cloud
  Then I should not see "Automation" cloud on VNF Settings Page
