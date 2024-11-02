const hitungLingkaran = (radius) => {
    const luas = Math.PI * Math.pow(radius, 2);
    const keliling = 2 * Math.PI * radius;
    return { luas, keliling };
}

const radius = parseFloat(prompt("Masukkan jari-jari lingkaran:"));
const { luas, keliling } = hitungLingkaran(radius);
console.log("Luas:", luas);
console.log("Keliling:", keliling);
