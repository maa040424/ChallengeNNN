import turtle

def draw_petal(t):
    """Menggambar satu kelopak bunga."""
    t.circle(100, 60)
    t.left(120)
    t.circle(100, 60)
    t.left(120)
    
def draw_flower(t, petals):
    """Menggambar bunga dengan jumlah kelopak tertentu."""
    for _ in range(petals):
        draw_petal(t)
        t.left(360 / petals)

def draw_stem(t):
    """Menggambar batang bunga."""
    t.right(90)
    t.forward(200)

def draw_leaf(t):
    """Menggambar daun bunga."""
    t.fillcolor("green")