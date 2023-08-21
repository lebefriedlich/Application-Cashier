# Application-Kasir

Database name is kasir

to create table data_barang

    CREATE TABLE `data_barang` (
      `no` int(5) NOT NULL AUTO_INCREMENT,
      `kode_barang` varchar(7) NOT NULL,
      `nama_barang` varchar(50) NOT NULL,
      `stok_barang` int(5) NOT NULL,
      `harga_satuan` int(10) NOT NULL,
      PRIMARY KEY (`no`)
    ) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4

to create 
