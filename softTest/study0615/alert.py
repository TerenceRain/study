from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/alert.html')
driver.get(file)
time.sleep(3)
driver.find_element_by_id('tooltip').click()
driver.implicitly_wait(5)
# 关闭弹出框
alert = driver.switch_to.alert
time.sleep(3)
alert.accept()
time.sleep(5)
driver.quit()