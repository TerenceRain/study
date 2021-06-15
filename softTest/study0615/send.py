from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/send.html')
driver.get(file)


driver.find_element_by_tag_name('input').click()
time.sleep(3)
alert = driver.switch_to.alert
alert.send_keys('123')
driver.implicitly_wait(5)
alert.accept()
time.sleep(3)
driver.quit()