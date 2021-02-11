import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private WebElement tableElement;
    private WebDriver driver;

    public Table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0); //Удаление первой строки ил List (Строка заголовка)
        return rows; // Вернем лист элементов
    }

    public List<WebElement> getHeadings() { //Метод позволяющий найти заголовки
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingsColumns = headingsRow.findElements(By.xpath(".//th"));
        return headingsColumns;
    }

    public List<List<WebElement>> getRowsWithColumns() { //лист листов (список списков колонок
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row : rows) {
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));//Проход по строкам. разбивание каждой строки на столбцы
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns; //получения списка строк разбитого на столбцы
    }

    public List<Map<String, WebElement>> getRowsWithColumnsByHeadings() { //List это список всех строк. Каждая строка это Map У которой ключ это стринг и значение вебэлемент // то есть по заголовку мы можем найти конкретную ячейку
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns(); //Получить список строк разбитый на заголовки
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = new ArrayList<Map<String, WebElement>>();
        Map<String, WebElement> rowByHeadings; //1 строка разбитая на столбцы по заголовкам
        List<WebElement> headingColumns = getHeadings();// получим заголовки воспользовавшись методом getHeadings()

        for (List<WebElement> row : rowsWithColumns) { //Пройти по всем строкам
            rowByHeadings = new HashMap<String, WebElement>();
            for (int i = 0; 1 < headingColumns.size(); i++) {
                String heading = headingColumns.get(i).getText();//Пройти по всем колонкам в строке для получения текста заголовка. heading будет хранить заголовок
                WebElement cell = row.get(i);
                rowByHeadings.put(heading, cell); // привязываем заголовок к ячейкам
            }
            rowsWithColumnsByHeadings.add(rowByHeadings);
         }
return rowsWithColumnsByHeadings;
}
    public  String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns (); //получить список списка столбцов
        WebElement cell = rowsWithColumns.get(rowNumber - 1). get(columnNumber-1); // вычетаем 1 для получения реальной строки
        return  cell.getText(); // данный метод позволить узнать значения ячейки по номеру строки и номеру столбца

    }
    public  String getValueFromCell(int rowNumber,  String columnName){
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = getRowsWithColumnsByHeadings(); //получить все строки со столбцами привязанные к заголовкам
        return rowsWithColumnsByHeadings.get(rowNumber - 1).get(columnName).getText();
    }


}