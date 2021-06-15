from selenium import webdriver
import time
driver = webdriver.Chrome()
url = 'https://baidu.com/'
driver.get(url)
# 浏览器最大化
driver.maximize_window()
# 浏览器自定义大小
# driver.set_window_size(400, 800)

driver.find_element_by_id("kw").send_keys('肖战')
driver.find_element_by_id('su').submit()
# 固定等待

time.sleep(5)

# 智能等待
# driver.implicitly_wait(10)
# driver.find_element_by_partial_link_text('肖战(中国内地男演员、歌手) - 百度百科').click()

# 浏览器的前进后退
# driver.back()
#
# time.sleep(5)
#
# driver.forward()
# time.sleep(5)
# title = driver.title
# url = driver.current_url
# print(title + url)

# 浏览器的控制条下拉
js1 = 'var q = document.documentElement.scrollTop = 10000'
driver.execute_script(js1)
time.sleep(2)
# 浏览器控制条上拉
js2 = 'var q = document.documentElement.scrollTop = 0'
driver.execute_script(js2)
time.sleep(2)
driver.quit()