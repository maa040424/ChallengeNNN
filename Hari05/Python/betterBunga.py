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
    t.begin_fill()
    t.circle(50, 90)
    t.left(90)
    t.circle(50, 90)
    t.left(90)
    t.end_fill()
    
def main():
    window = turtle.Screen()
    window.bgcolor("lightblue")
    
    t = turtle.Turtle()
    t.color("red")
    t.speed(10)
    
    draw_flower(t, 10)
    
    t.color("brown")
    draw_stem(t)
    
    t.left(45)
    draw_leaf(t)
    
    t.hideturtle()
    window.mainloop()
    