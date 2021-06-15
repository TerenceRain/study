from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/upload.html')
driver.get(file)

time.sleep(3)

driver.find_element_by_tag_name('input').send_keys("")