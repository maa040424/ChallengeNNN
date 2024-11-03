def daftar_belanjaan():
    belanjaan = []
    
    while True:
        print("\nMenu:")
        print("1. Tambah Belanjaan")
        print("2. Tampilkan Daftar Belanjaan")
        print("3. Hapus Item")
        print("4. Keluar")
        
        pilihan = input("Pilih opsi (1-4): ")
        
        if pilihan == "1" :
            item = input("Masukan item belanjaan:")