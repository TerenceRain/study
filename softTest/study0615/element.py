from selenium import webdriver
import os
import time

driver = webdriver.Chrome()
url = 'file:///' + os.path.abspath('F:/surrounds/locateElement/selenium2html/frame.html')
driver.get(url)

# driver.find_element_by_id('c1').click()
# driver.find_element_by_id('c2').click()
# driver.find_element_by_id('c3').click()
#
# inputs = driver.find_elements_by_tag_name('input')
# for input in inputs:
#     if input.get_attribute('type') == 'checkbox':
#         input.click()
time.sleep(3)
# 转换层级
driver.switch_to.frame('f1')
driver.switch_to.frame('f2')
driver.find_element_by_id('kw').send_keys('布拉格')
driver.find_element_by_id('su').click()
time.sleep(2)
# 回到默认页面
driver.switch_to.default_content()
driver.switch_to.frame('f1')
driver.find_element_by_link_text('click').click()
