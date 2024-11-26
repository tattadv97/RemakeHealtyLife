// Top-level build file where you can add configuration options common to all sub-projects/modules.
// File build tingkat atas tempat Anda dapat menambahkan opsi konfigurasi yang umum untuk semua sub-proyek/modul.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false // Pertahankan baris ini
    // Hapus atau beri komentar pada baris berikut:
    // id("com.google.gms.google-services") version "4.4.2" apply true
}