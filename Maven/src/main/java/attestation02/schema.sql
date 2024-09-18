-- создание таблицы с товаром "product"

create table if not exists product
(
    id serial primary key, --идентификатор строки
    -- определяем столбцы
    description varchar(20),
    cost float,
    count integer

);
comment on table product is 'Таблица с информацией о товаре.';
comment on column product.id is 'Идентификатор товара';
comment on column product.description is 'Описание товара';
comment on column product.cost is 'Стоимость товара';
comment on column product.count is 'Количество товара';

-- создание таблицы c покупателями "customer"

create table if not exists customer
(
    id serial primary key, --идентификатор строки
    -- определяем столбцы
    name_last_name varchar(40)

);

comment on table customer is 'Таблица с информацией о покупателе.';
comment on column customer.id is 'Идентификатор покупателя';
comment on column customer.name_last_name is 'Имя и фамилия покупателя';

-- создание таблицы c заказами "the_order"

create table if not exists the_order
(
    id serial primary key, --идентификатор строки
    id_product integer references product(id),
    id_customer integer references customer(id),
    order_date date,
    number_of_products integer

);

comment on table the_order is 'Таблица с информацией о заказе.';
comment on column the_order.id is 'Идентификатор заказа';
comment on column the_order.id_product is 'Идентификатор товара';
comment on column the_order.id_customer is 'Идентификатор покупателя';
comment on column the_order.order_date is 'Дата заказа';
comment on column the_order.number_of_products is 'Количество заказанных товаров';

--заполнение таблицы  товаром "Product"
insert into product(description, cost, count)
VALUES('Вешалка', 5000, 10),
      ('Кирпич', 4000, 30),
      ('Шкаф', 3000, 5),
      ('Компьютер', 23000, 14),
      ('Коврик', 2000, 8),
      ('Гвоздик', 1000, 20),
      ('Монитор', 18000, 10),
      ('Стол', 10000, 25),
      ('Диван', 8000, 12),
      ('Кресло', 15000, 15);

--заполнение таблицы c покупателями "Person"
insert into customer(name_last_name)
VALUES
    ('Анна_Волкова'),
    ('Маша_Пирсова'),
    ('Паша_Крид'),
    ('Катя_Минаева'),
    ('Костя_Молох'),
    ('Виктор_Принц'),
    ('Маша_Жаба'),
    ('Мила_Крутик'),
    ('Даша_Комарова'),
    ('Саша_Миня');

--заполнение таблицы с заказом "Order"
insert into the_order(id_product, id_customer, order_date, number_of_products)
VALUES
    (1, 10, now(),3),
    (2, 9, now(),8),
    (3, 8, now(),9),
    (4, 7, now(),5),
    (5, 6, now(),4),
    (6, 5, now(),7),
    (7, 4, now(),3),
    (3, 2, now(),4),
    (6, 5, now(),10),
    (10, 10, now(),6);