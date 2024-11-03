def daftar_belanjaan():
    belanjaan = []

    while True:
        print("\nMenu:")
        print("1. Tambah item")
        print("2. Tampilkan daftar belanjaan")
        print("3. Hapus item")
        print("4. Keluar")
        
        pilihan = input("Pilih opsi (1-4): ")
        
        if pilihan == '1':
            item = input("Masukkan item belanjaan: ")
            belanjaan.append(item)
            print(f"'{item}' telah ditambahkan.")
        
        elif pilihan == '2':
            print("\nDaftar Belanjaan:")
            for i, item in enumerate(belanjaan, start=1):
                print(f"{i}. {item}")
        
        elif pilihan == '3':
            if belanjaan:
                print("\nDaftar Belanjaan:")
                for i, item in enumerate(belanjaan, start=1):
                    print(f"{i}. {item}")
                indeks = int(input("Masukkan nomor item yang ingin dihapus: "))
                if 1 <= indeks <= len(belanjaan):
                    removed_item = belanjaan.pop(indeks - 1)
                    print(f"'{removed_item}' telah dihapus.")
                else:
                    print("Nomor item tidak valid.")
            else:
                print("Daftar belanjaan kosong.")
        
        elif pilihan == '4':
            print("Keluar dari program.")
            break
        
        else:
            print("Pilihan tidak valid. Silakan coba lagi.")

daftar_belanjaan()
