class Rekening(nasabah: String, saldo: Int) {
    // nama nasabah
    val nama: String = nasabah
    var saldo: Int = saldo

    fun infoRekening() {
        println("Informasi rekening Anda saat ini")
        println("==========================")
        println("Nama\t: $nama")
        println("Saldo\t: $saldo")
        println("==========================")
    }

    inner class Keluarga {
        // membuat biaya administrasi
        val admin: Int = 5000
        val bunga: Double = 0.5
        val transfer: Int = 6500

        fun transfer(nasabah: String, jumlah: Int) {
            // jika saldo mencukupi
            if(saldo >= (jumlah + transfer)) {
                println("Selamat $nama! Berhasil melakukan transfer kepada $nasabah sejumlah $jumlah! (biaya admin $transfer)")
                saldo -= jumlah
                saldo -= transfer
                infoRekening()
            } else { // jika tidak
                println("Saldo Anda tidak mencukupi!")
            }
        }
        fun tampilkanAdmin() {
            println("Admin per bulan\t: $admin")
            println("Bunga\t: $bunga")
            println("Transfer\t: $transfer")
        }
    }

    inner class Pelajar {
        // membuat biaya administrasi
        val admin: Int = 3000
        val bunga: Double = 0.3
        val transfer: Int = 3000

        fun transfer(nasabah: String, jumlah: Int) {
            // jika saldo mencukupi
            if(saldo >= (jumlah + transfer)) {
                println("Selamat $nama! Berhasil melakukan transfer kepada $nasabah sejumlah $jumlah! (biaya admin $transfer)")
                saldo -= jumlah
                saldo -= transfer
                infoRekening()
            } else { // jika tidak
                println("Saldo Anda tidak mencukupi!")
            }
        }
        fun tampilkanAdmin() {
            println("Admin per bulan\t: $admin")
            println("Bunga\t: $bunga")
            println("Transfer\t: $transfer")
        }
    }
    inner class Bisnis {
        // membuat biaya administrasi
        val admin: Int = 10000
        val bunga: Double = 0.75
        val transfer: Int = 1000

        fun transfer(nasabah: String, jumlah: Int) {
            // jika saldo mencukupi
            if(saldo >= (jumlah + transfer)) {
                println("Selamat $nama! Berhasil melakukan transfer kepada $nasabah sejumlah $jumlah! (biaya admin $transfer)")
                saldo -= jumlah
                saldo -= transfer
                infoRekening()
            } else { // jika tidak
                println("Saldo Anda tidak mencukupi!")
            }
        }
        fun tampilkanAdmin() {
            println("Admin per bulan\t: $admin")
            println("Bunga\t: $bunga")
            println("Transfer\t: $transfer")
        }
    }
}

fun main(args: Array<String>) {
    val bantolo = Rekening("Bantolo", 500000).Pelajar()
    bantolo.transfer("Setiadi", 15000)
}