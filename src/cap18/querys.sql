CREATE SCHEMA `impacta` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `impacta`.`pessoa`
(
    `idpessoa` INT          NOT NULL AUTO_INCREMENT,
    `nome`     VARCHAR(400) NOT NULL,
    `cpf`      VARCHAR(11)  NOT NULL,
    PRIMARY KEY (`idpessoa`),
    UNIQUE INDEX `idpessoa_UNIQUE` (`idpessoa` ASC) VISIBLE,
    UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) VISIBLE
)
    ENGINE = InnoDB
DEFAULT CHARACTER
SET = utf8
COMMENT = 'salva as pessoas';


SELECT * FROM impacta.pessoa;

INSERT INTO `impacta`.`pessoa` (`nome`, `cpf`) VALUES ('Alex Mota', '12345678912');
INSERT INTO `impacta`.`pessoa` VALUES (2, 'Maria Mota', '32165498732');

UPDATE `impacta`.`pessoa`
SET `nome` = 'Alex Mota'
WHERE (`idpessoa` = '1');

UPDATE `impacta`.`pessoa`
SET `nome` = 'Maria Mota'
WHERE (`idpessoa` = '2');

DELETE FROM `impacta`.`pessoa`
WHERE `idpessoa` = '2';

