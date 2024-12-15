# Car Data Project

## Описание проекта

Этот проект демонстрирует создание и обработку данных о машинах, а также их визуализацию с использованием библиотеки JFreeChart. Проект включает создание классов для работы с данными, методы для генерации, чтения и записи данных, взаимодействие с базой данных и создание графиков.

## Функциональность

- Генерация данных о машинах
- Запись и чтение данных в/из файла
- Взаимодействие с базой данных SQLite
- Визуализация данных с использованием JFreeChart

## Структура проекта

- **Car**: Класс, представляющий машину с полями `model`, `weight`, `speed`.
- **CarHandler**: Класс для работы с данными машин. Включает методы для генерации данных, поиска максимального веса и средней скорости, записи и чтения данных из файла.
- **DataBase**: Класс для работы с базой данных SQLite. Включает методы для создания таблицы, вставки данных и выборки всех данных.
- **ChartExample**: Класс для создания и отображения графиков с использованием JFreeChart.

## Установка

### Шаг 1: Клонирование репозитория

```bash
git clone https://github.com/yourusername/car-data-project.git
cd car-data-project
