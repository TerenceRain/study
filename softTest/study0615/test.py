from selenium  import webdriver
import time
driver = webdriver.Chrome()
url = 'https://baidu.com'
driver.get(url)
driver.find_element_by_css_selector('#kw').send_keys('狂人日记')
driver.find_element_by_css_selector('#su').click()
# time.sleep(5)
# driver.find_element_by_css_selector('#kw').clear()
# driver.find_element_by_css_selector('#kw').send_keys('青春')
# driver.find_element_by_css_selector('#su').click()
# text = driver.find_element_by_id('s-top-left').text
# print(text)
time.sleep(5)
driver.quit()