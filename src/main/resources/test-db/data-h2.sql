INSERT INTO account_type (name) VALUES ('銀行');
INSERT INTO account_type (name) VALUES ('信用卡');
INSERT INTO account_type (name) VALUES ('現金');
INSERT INTO currency (name) VALUES ('新台幣');
INSERT INTO currency (name) VALUES ('美元');
INSERT INTO category (name, category_type) VALUES ('一般收入', 0);
INSERT INTO category (name, category_type) VALUES ('餐飲', 1);
INSERT INTO item (name, category_id) SELECT '薪資', id FROM category WHERE name = '一般收入';
INSERT INTO item (name, category_id) SELECT '活存利息', id FROM category WHERE name = '一般收入';
INSERT INTO item (name, category_id) SELECT '早餐', id FROM category WHERE name = '餐飲';
INSERT INTO item (name, category_id) SELECT '午餐', id FROM category WHERE name = '餐飲';
INSERT INTO item (name, category_id) SELECT '晚餐', id FROM category WHERE name = '餐飲';