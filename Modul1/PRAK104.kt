class Pekerjaan(Jenis: String, Domisili: String, Jabatan: String, gaji: String,){
    var Jenis = Jenis;
    var Domisili = Domisili;
    var Jabatan = Jabatan;
    var gaji = gaji;

    fun print(){
        println("Jenis Pekerjaan : $Jenis ");
        println("Domisili : $Domisili ");
        println("Jabatan : $Jabatan");
        println("Gaji : $gaji");
    }
}
fun main(args: Array<String>){
    val data_1 = Pekerjaan("Konsultan","Banjarmasin", "Direktur Utama", "17 Juta");
    data_1.print();
}
