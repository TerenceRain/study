from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()

url = 'https://baidu.com'
driver.get(url)
driver.find_element_by_id('kw').send_keys('肖战')

driver.find_element_by_id('su').send_keys(Keys.Enter)
