package TP04

data class Mahasiswa(var nim : String, var nama :String)

class Jurusan(private var kodeJurusan : String, private var namaJurusan : String){
    private val daftar = arrayOfNulls<Mahasiswa>(4)
    private var jumlahMhs = 0

    fun addMahasiswa(m : Mahasiswa){
        daftar[jumlahMhs] = m
        jumlahMhs++
    }

    fun display(){
        println("Kode Jurusan : "+kodeJurusan)
        println("Nama Jurusan : "+namaJurusan)
        println("Daftar Mahasiswa")
        for (i in 0..jumlahMhs-1){
            println(daftar[i]!!.nim+" "+daftar[i]!!.nama)
        }
    }
}

fun main(){
    val mhs1 = Mahasiswa("6706174061","Daffa Juliano")
    val mhs2 = Mahasiswa("6706174062","Daffa Juliani")
    val mhs3 = Mahasiswa("6706174063","Daffa Juliana")
    val mhs4 = Mahasiswa("6706174064","Daffa Juliane")

    val jurusan = Jurusan("FIT","Fakultas Ilmu Terapan")
    jurusan.addMahasiswa(mhs1)
    jurusan.addMahasiswa(mhs2)
    jurusan.addMahasiswa(mhs3)
    jurusan.addMahasiswa(mhs4)
    jurusan.display()
}