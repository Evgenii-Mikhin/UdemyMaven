import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.xml.datatype.Duration;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait; //Инициализация дравера ожидания
    static  WebDriverWait wait2;
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deri\\IdeaProjects\\UdemyMaven\\Drivers\\geckodriver.exe"); //Обращение к гекодрайверу (работа с фаерфокс браузером)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deri\\IdeaProjects\\UdemyMaven\\Drivers\\chromedriver.exe"); //Обращение к хромдрайверу (работа с гугл хром браузером)
        //driver = new FirefoxDriver(); // Инициализация драйвера мозилы
        driver = new ChromeDriver(); // Инициализация драйвера хрома

        //driver.get("https://www.delivery-club.ru/moscow"); // переход на сайт деливери (метод get)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Не явыное ожидание Ожидание до 5 секунд (задать ожидание для каждого поиска элемента
        wait = (new WebDriverWait(driver, 5)); // создан драйвер ожидания (конкретное ожидание конкретного элемента)
        wait2 = (new WebDriverWait(driver, 10));
        //Пример использования драйыера явного ожидания wait.until(ExpectedCondition.visibilityOfElemenLocated(By.xpath("//table[@ID=\"customers\"]"));
        //Thread.sleep(1000); //сон
//ЗАПУСК ТЕСТОВ БЕЗ ГРАФИЧЕСКОГО ИНТЕРФЕЙСА ХРОМА (Запуска)
        //Для этого используется driver = new FhantomJSDriver();
 //МЕТОДЫ
       /*
        driver.manage().window().setSize(new Dimension(900,500));//Размер окна браузера
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Ожидание 5 секунд
        driver.navigate().to("https://www.google.ru/");//Альтернативный метод to (Переход на страницу)
        driver.navigate().back(); //Возврат на предыдущую страницу
        driver.navigate().forward();//Переход на страницу вперед
        driver.navigate().refresh();//Перезагрузка сраниц=-

        System.out.println(driver.getTitle()); //Вывод тайтла страницы в консоль
        System.out.println(driver.getCurrentUrl());//Вывод URL страницы в консоль

        driver.quit();//Завершение драйвера. Закрытие браузера
        */
// ПОИСК ВЕБ ЭЛЕМЕНТОВ
       /*
        WebElement link =  driver.findElement(By.linkText("Войти"));//Поиск элемента по тексту (WebElement link = Создание переменной для хранения ссылки)
        WebElement link2 =  driver.findElement(By.partialLinkText("Войти")); //Найти ссылку по части текста
        WebElement findElement1 =driver.findElement(By.name("sushi"));//Поиск элемента по имени (Name "")
        WebElement findElement2 =driver.findElement(By.className("icon__use"));//Поиск элемента по имени класса (Class "")
        WebElement findElement3 =driver.findElement(By.id()); //Поиск элемента по ID
        WebElement findElement4 =driver.findElement(By.cssSelector("div#cuisines-panel cuisines-panel__container Li#cuisines-panel__slide")); //Поиск элемента по css
        WebElement findElement5 =driver.findElement(By.xpath()); // Поиск элемента по xpath
        */
        //РАБОТА С КНОПКАМИ
        /*
        driver.findElement(By.xpath("//button[@class='header-login-button']")).click(); //клик по кнопке
        driver.findElement(By.xpath("//a[@class='cuisines-panel__slide-btn']")).click(); //Клик по кнопке
        driver.findElement(By.name("sushi")).click(); //Клик по кнопке
         */
        //РАБОТА С ТЕКСОВЫМИ ПОЛЯМИ
        /*
        driver.findElement(By.xpath("//button[@class='header-login-button']")).click();
        driver.findElement(By.xpath("//input[@class='input--def filled']")).sendKeys("9998085984");
         */
//РАБОА С РАДИОБАТОННАМИ И ЧЕКБОКСАМИ
/*
        driver.get("https://market.yandex.ru/"); // открыть страницу
        Thread.sleep(1000);//сон 1 секунда
        driver.findElement(By.xpath("//span[contains(text(),'Электроника')]")).click();//нажать на кнопку Электроника
        driver.findElement(By.xpath("//a[contains(text(),'Аккумуляторные батареи')]")).click();//Нажать на кнопку аккомуляторные батареи
        selectCheckBox( "С учётом доставки курьером");
        selectCheckBox( "В продаже");
        selectCheckBox( "свинец (жидкостный элемент, заряжен)");
        selectCheckBox( "свинец (сухой элемент, AGM)");
        selectCheckBox( "свинец (жидкостный элемент, заряжен)");
        System.out.println(driver.findElement(By.xpath("//div[@class='online-card-program selected']")).isSelected()); // проверка состояния чекбокса тру и фолс

       // if (!driver.findElement(By.xpath("//span[contains(text(),'С учётом доставки курьером')]")).isSelected());//проверить нажат ли чекбокс С учетом доставки кудбером
       // driver.findElement(By.xpath("//span[contains(text(),'С учётом доставки курьером')]")).click();// если нет то нажать

    }
     public static void selectCheckBox (String name){ //Метод для включения чекбоксов
        String rbXpath ="//span[contains(text(),'%s')]"; //Шаблон икспаса
         if (!driver.findElement(By.xpath(String.format(rbXpath, name))).isSelected())
             driver.findElement(By.xpath(String.format(rbXpath, name))).click();
             }
 */
//РАБОТЫ С ВЫПАДАЮЩИМИ СПИСКАМИ
/*
        driver.get("https://vk.com");
        driver.findElement(By.xpath("//div[@class='selected_items_wrap']")).click();
*/
//РАБОТА СО СПИСКОМ ЭЛЕМЕНТОВ
        /*
        driver.get("https://market.yandex.ru/"); // открыть страницу
        Thread.sleep(1000);//сон 1 секунда
        driver.findElement(By.xpath("//span[contains(text(),'Электроника')]")).click();//нажать на кнопку Электроника
        driver.findElement(By.xpath("//a[contains(text(),'Аккумуляторные батареи')]")).click();//Нажать на кнопку аккомуляторные батареи

        List<WebElement> checkboxess = driver.findElements(By.xpath("//body/div[2]/div[3]/div[3]/div[4]/aside[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/fieldset[1]/ul[1]//span[@class='NVoaOvqe58']"));//создать лист с чекбоксами
        //checkboxess.get(3).click(); //Нажать на чекбокс с интедком 3 из списка.
        if (checkboxess.size()==12) System.out.println("Колличесво чекбоксов соответсвует 12");
        else System.out.println("Чекбоксов менее 12!!!");

        for (WebElement checkKlick : checkboxess ){ //Создать цикл с чекбоксами и клинкуть на каждый.
            checkKlick.click();
         */
 // РАБОТА С ТАБЛИЦАМИ
        /*
        driver.get("https://www.w3schools.com/html/html_tables.asp"); // открыть страницу
        WebElement tableElement = driver.findElement(By.xpath("//table[@ID=\"customers\"]"));
        Table table = new Table(tableElement, driver);
        System.out.println("Rows number is:"+ table.getRows().size());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4,1));
        driver.quit();
            */
//ЗАПУСК JAVA SCRIPT
       /* JavascriptExecutor jse = (JavascriptExecutor) driver; //"С помощью данной переменной можно выполнять джава скрипт"
        jse.executeScript ("window.scrollBy(0,1000)","");//Джава скрипт скрол страницы
        jse.executeScript ("alert('HELLO WORLD!');");// джава скриппт сообщение в окне браузера

        */

       //Алерт
       /* Thread.sleep(3000);
        driver.switchTo().alert().accept();
        */
 //РАБОТА С ОКНАМИ и ВКЛАДКАМИ БРАУЗЕРА   (При открытии нового окна во время работы. Селениум продолжает работы в том же окне в котором работал.
/*
        driver.get("https://yandex.ru/"); // открыть страницу
        String mainTab = driver.getWindowHandle(); //Запомнить текущее окно
        driver.findElement(By.xpath("//div[@class='services-new__icon']")).click(); //открыть новое окно
        for (String windowHandle:driver.getWindowHandles()){ //данный метод позволяет вернуть имена всех окон котрые открыты и переключатся на новое окно. таким образом мы перелючимся на последнее окно
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("//div[@class='cia-vs']")).click();
        driver.switchTo().window(mainTab);
        driver.findElement(By.xpath("//div[@class='services-new__icon']")).click();
   */
//ПРОВЕРКА НАЛИЧИЯ ЭЛЕМЕНТОВ
        /*
         driver.get("https://github.com/");
       // System.out.println(driver.findElements(By.xpath("//a[text()='Log in']")).size()); //Размер списка по данному пути в консоль
    if (driver.findElements(By.xpath("//a[text()='Log in']")).size() > 0) System.out.println("Такой элемент существует");
    else System.out.println("Элемент не представлен");
         */
//ИИТАЦИЯ НАЖАТИЯ КЛАВИШЬ НА КЛАВИАТУРЕ
        /*
        driver.get("https://ru.wikipedia.org");
       WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
       // searchInput.sendKeys("Test");//ввести текст
        // searchInput.sendKeys(Keys.ENTER); //вызов нажанияентера внутри текстового поля
        //применение комбинации клавиш
        searchInput.sendKeys(Keys.chord(Keys.SHIFT,"тест"));//ввести текст c зажатой клавишей Шифт
        String select = Keys.chord(Keys.CONTROL,"a"); //создание переменно контрл + а (выделить текст)
        String cut = Keys.chord(Keys.CONTROL,"x");// создание переменной Контрл + х (Вырезать текст)
        String paste = Keys.chord(Keys.CONTROL,"v");// создание переменной Контрл + v (Вырезать текст)
        searchInput.sendKeys("Test");//ввести текст
        searchInput.sendKeys(select); //Использование переменной селект (выделение текста)
        searchInput.sendKeys(cut);//использование переменной с сочитаением клавиш
        searchInput.sendKeys(paste);//использование переменной с сочитаением клавиш
        searchInput.sendKeys(Keys.ENTER); //вызов нажанияентера внутри текстового поля
         */

// СОЗДАНИЕ СКРИНШОТОВ
        /*
        driver.get("https://ru.wikipedia.org");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
        searchInput.sendKeys(Keys.chord(Keys.SHIFT,"тест"));//ввести текст c зажатой клавишей Шифт
        String select = Keys.chord(Keys.CONTROL,"a"); //создание переменно контрл + а (выделить текст)
        String cut = Keys.chord(Keys.CONTROL,"x");// создание переменной Контрл + х (Вырезать текст)
        String paste = Keys.chord(Keys.CONTROL,"v");// создание переменной Контрл + v (Вырезать текст)
        searchInput.sendKeys("Test");//ввести текст
        searchInput.sendKeys(select); //Использование переменной селект (выделение текста)
        searchInput.sendKeys(cut);//использование переменной с сочитаением клавиш
        searchInput.sendKeys(paste);//использование переменной с сочитаением клавиш
        searchInput.sendKeys(Keys.ENTER); //вызов нажанияентера внутри текстового поля

        Date dateNow = new Date();// создание переменной Дата
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss"); //Формат сохранения даты (часы, митуты. секунды)
        String fileName = format.format(dateNow)+".png"; //создание имени файла
File screanshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Создание пременной типа файл (скриншот, в которую мы поместим сделанный скрин)
        try {
            FieldUtil.copyFile(screanshot), new  File("C:\\Users\\Deri\\Desktop\\джава скрины\\scrianshot1.png"+fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit(); //закрыть драйвер
         */
//ЗАГРУЗКА ФАЙЛОВ
          /*
        driver.get("https://www.google.ru/imghp?hl=ru&tab=wi&ogbl");
        driver.findElement(By.xpath("//span[@class='BwoPOe']")).click();
        driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Фото\\2018.05.04 Тест обьектива\\2\\Ватермарка\\DSC06430.jpg"); //загрузка файсла с помощью селениума
           */
    }
    }



