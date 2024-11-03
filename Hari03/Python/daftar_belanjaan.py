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
            item = input("Masukan item belanjaan: ")
            belanjaan.append(item)
            print(f"'{item}' telah ditambahkan. Jangan boros ya!")
        elif pilihan == "2":
            print("\nDaftar Belanjaan:")
            for i, item in enumerate(belanjaan, start=1):
                print(f"{i}. {item}")
        elif pilihan == "3" :
            print for i, item in  enumerate(belanjaan, start=1):
                print(f"{i}. {item}")
            indeks = int(input("Masukkan nomor item yang ingin dihapus: "))        
        