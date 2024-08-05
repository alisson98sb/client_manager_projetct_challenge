CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE address (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    street VARCHAR(100) NOT NULL,
    address_number VARCHAR(20) NOT NULL,
    complement VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    zip_code VARCHAR(50) NOT NULL
);
