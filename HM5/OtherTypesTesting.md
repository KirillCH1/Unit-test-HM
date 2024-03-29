### Задание 1

#### 1. Юнит-тесты:

- **Название теста:** `testAddContact`
  - **Описание:** Проверяет, что функция добавления контакта корректно добавляет новый контакт в список контактов.
    
- **Название теста:** `testEditContact`
  - **Описание:** Проверяет, что функция редактирования контакта корректно изменяет данные контакта.

- **Название теста:** `testDeleteContact`
  - **Описание:** Проверяет, что функция удаления контакта корректно удаляет контакт из списка.

#### 2. Интеграционные тесты:

- **Название теста:** `testUIContactDisplay`
  - **Описание:** Проверяет, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.

- **Название теста:** `testFullContactCycle`
  - **Описание:** Проверяет полный цикл работы с контактом: создание контакта, его редактирование и последующее удаление.

#### 3. Сквозные тесты:

- **Название теста:** `testEndToEndContactManagement`
  - **Описание:** Проверяет взаимодействие всех компонентов приложения для управления контактами, включая добавление, редактирование и удаление.

### Задание 2

1. **Проверка того, что функция addContact корректно добавляет новый контакт в список контактов:**
   - **Тип:** Юнит-тест
   - **Обоснование:** Тест направлен на проверку конкретной функции (addContact) и её корректного выполнения.

2. **Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов:**
   - **Тип:** Интеграционный тест
   - **Обоснование:** Тест охватывает взаимодействие между пользовательским интерфейсом и логикой добавления контакта, проверяя целостность этого процесса.

3. **Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление:**
   - **Тип:** Интеграционный тест
   - **Обоснование:** Тест проверяет взаимодействие нескольких функций (создание, редактирование, удаление) в рамках одного цикла работы с контактом.
