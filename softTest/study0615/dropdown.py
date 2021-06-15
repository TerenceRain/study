from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/drop_down.html')
driver.get(file)
options = driver.find_element_by_id('ShippingMethod').find_elements_by_tag_name('option')
time.sleep(3)
# for option in options:
#     if option.get_attribute('value') == '10.69':
#         option.click()
options[2].click()

time.sleep(3)