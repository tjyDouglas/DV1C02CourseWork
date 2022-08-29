//// -- LEVEL 1
//// -- Schemas, Tables and References

// Creating tables
// You can define the tables with full schema names
Table ecommerce.master {
  id int
  customer_id varchar
  seller_id varchar
  product_id varchar
  payment_id varchar
  delivery_id varchar
  
  created_at timestamp
  admin_id int [ref: > custom.id]
  Indexes {
    (id, created_at) [pk]
  }
  
}

// If schema name is omitted, it will default to "public" schema.
Table customers as custom {
  id int [pk, increment] // auto-increment
  customer_name varchar
  customer_mobile_no varchar
  customer_email varchar
  customer_address varchar
  created_at varchar [note: 'When customer ordered'] // add column note
  
}

Table seller as sell {
  id int [pk, increment] // auto-increment
  seller_id varchar [not null, unique]
  seller_name varchar
  seller_mobile_no varchar
  sellerr_email varchar
  seller_address varchar
  created_at varchar [note: 'When seller sold'] // add column note
  
}

Table products as prod {
  id int [pk, increment] // auto-increment
  product_name varchar
  product_price double
  product_quantity int
  product_country_of_origin varchar
  product_category varchar
  product_status varchar
  
  //created_at datetime [default: `now()`]
  created_at varchar [note: 'When product sold'] // add column note
  seller_id int [not null]
  
  Indexes {
    (id, product_status) [name:'product_status']
    id [unique]
  }
  
}

Table delivery as deli{
  id int [pk, increment] // auto-increment
  delivery_name varchar
  delivery_type varchar
  delivery_date varchar
  delivery_address varchar
  created_at varchar [note: 'When delivery done'] // add column note
  
 }
 
 Table payment as pay{
  id int [pk, increment] // auto-increment
  payment_amount varchar
  payment_currency varchar
  payment_method varchar
  payment_date varchar
  created_at varchar [note: 'When payment done'] // add column note

 }

// Creating references
// You can also define relaionship separately
// > many-to-one; < one-to-many; - one-to-one; <> many-to-many
//Ref: custom.id one-to-one product.id  
Ref: custom.created_at > prod.created_at
