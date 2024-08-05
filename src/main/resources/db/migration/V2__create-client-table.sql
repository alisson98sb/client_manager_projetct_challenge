CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE client (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    cpf_cnpj VARCHAR(20) NOT NULL,
    corporate_reason VARCHAR(50) NOT NULL,
    representative VARCHAR(50) NOT NULL,
    status_is_active BOOLEAN NOT NULL,
    address_id UUID,
    FOREIGN KEY (address_id) REFERENCES address(id) ON DELETE CASCADE
);
