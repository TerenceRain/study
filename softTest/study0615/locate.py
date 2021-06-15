from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains
driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/level_locate.html')
driver.get(file)
driver.find_element_by_link_text('Link1').click()

# 定位下拉列表特定的元素
element = driver.find_element_by_id('dropdown1').find_element_by_link_text('Another action')
# 把鼠标放到这个元素上
ActionChains(driver).move_to_element(element).perform()
time.sleep(3)