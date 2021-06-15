from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/modal.html')
driver.get(file)

time.sleep(3)
driver.find_element_by_link_text('Click').click()

time.sleep(3)

div0 = driver.find_element_by_class_name('modal-body')
div0.find_element_by_id('click').click()
time.sleep(3)
div1 = driver.find_element_by_class_name('modal-footer')
div1.find_element_by_class_name('btn').click()

time.sleep(5)

driver.quit()