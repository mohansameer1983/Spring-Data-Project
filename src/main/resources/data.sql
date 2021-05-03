DROP TABLE IF EXISTS payments;

CREATE TABLE payments (
  PaymentId INT AUTO_INCREMENT  PRIMARY KEY,
  PaymentAmt Float(250) NOT NULL,
  Currency VARCHAR(250) NOT NULL
);

INSERT INTO payments (PaymentAmt, Currency) VALUES
  (234.88, 'CAD'),
  (424.44, 'USD'),
  (8774.43, 'GBP');