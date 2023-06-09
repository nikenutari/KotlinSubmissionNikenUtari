package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namadepan = "Niken"
    val namabelakang = "Utari"
    val umur = 21
    val tahun = "tahun"
    val sekolah = "STMIK Widya Utama"
    val jurusan = "Teknik Informatika"
    val semester = "6"
    println("Hai, Perkenalkan nama saya $namadepan $namabelakang, Umur saya $umur $tahun. Saya mahasiswa $sekolah, jurusan $jurusan semester $semester" )

    var menikah : Boolean = false
    var single = if (menikah) "Menikah" else "Single"
    println("Status: $single")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println(groupId)
    println(groupMember)
    println(session)

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
val groupMember:String = "Niken, Rania, Lutfia, Anjeli, Rasyid, Zaky, Destiarani, Aisya, Alif, Cahya, Ariffal, Widya"
    println("Anggota grup saya, yaitu $groupMember")
    return "ParentPal"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 12

    return (mentor.count() + countOfGroup)

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(12, listOf("Niken", "Rania", "Lutfia", "Anjeli", "Rasyid", "Zaky", "Destiarani", "Aisya", "Alif", "Cahya", "Ariffal", "Widya"), "Morning")

}