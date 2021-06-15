from selenium import webdriver
import  unittest
import time
from selenium.common.exceptions import NoAlertPresentException

class testCase_1(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = 'https://baidu.com'
        self.driver.get(self.url)
        time.sleep(3)

    def tearDown(self):
        self.driver.quit()

    def test_baidu1(self):
        driver = self.driver
        driver.find_element_by_id('kw').send_keys('孔刘')
        driver.find_element_by_id('su').click()
        time.sleep(6)

    def test_baidu2(self):
        driver = self.driver
        driver.find_element_by_link_text('新闻').click()
        time.sleep(3)
    def is_alert_exist(self):
        try:
            self.driver.switch_to.alert
        except NoAlertPresentException as e:
            return False
        return True
    if __name__ == '_main_':
        if __name__ == '__main__':
            unittest.main(verbosity = 0)
