-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 24-Out-2022 às 19:16
-- Versão do servidor: 8.0.27
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_livros`
--

DROP TABLE IF EXISTS `cad_livros`;
CREATE TABLE IF NOT EXISTS `cad_livros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_livro` varchar(200) DEFAULT NULL,
  `editora` varchar(100) DEFAULT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `status_livro` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'Disponível',
  `valor_livro` int DEFAULT NULL,
  `ano_lancamento` int DEFAULT NULL,
  `cod_livro` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

--
-- Extraindo dados da tabela `cad_livros`
--

INSERT INTO `cad_livros` (`id`, `nome_livro`, `editora`, `autor`, `categoria`, `status_livro`, `valor_livro`, `ano_lancamento`, `cod_livro`) VALUES
(1, 'O homem de giz', 'Intrinseca', 'C.J Tudor', 'Suspense, Policial', 'Disponível', 20, 2019, 2233),
(2, 'As outras pessoas', 'Intrinseca', 'C.J Tudor', 'Suspense', 'Disponível', 15, 2020, 223300),
(3, 'Mundo em caos', 'Intrinseca', 'Patrick Ness', 'Ficcão', 'Disponível', 40, 2019, 123456789),
(4, 'Mundo em caos - Vol 02', 'Intrinseca', 'Patrick Ness', 'Ficcão', 'Emprestado', 30, 2021, 332211);

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimos`
--

DROP TABLE IF EXISTS `emprestimos`;
CREATE TABLE IF NOT EXISTS `emprestimos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(200) DEFAULT NULL,
  `cpf` int DEFAULT NULL,
  `telefone` int DEFAULT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `nCasa` int DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `nome_livro` varchar(200) DEFAULT NULL,
  `valor` int DEFAULT NULL,
  `data_emprestimo` varchar(20) DEFAULT NULL,
  `data_devolucao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

--
-- Extraindo dados da tabela `emprestimos`
--

INSERT INTO `emprestimos` (`id`, `nome_cliente`, `cpf`, `telefone`, `rua`, `nCasa`, `bairro`, `nome_livro`, `valor`, `data_emprestimo`, `data_devolucao`) VALUES
(2, 'Grazielle', 134456, 1321, 'aaa', 12, 'aaaa', 'Mundo em caos - Vol 02', 0, 'aa', 'aa');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
