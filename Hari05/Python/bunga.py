import turtle

def draw_petal(t):
    t.circle(100, 60)
    t.left(120)
    t.circle(100,60)
    t.left(120)
    
def draw_flower(t, petals):
    for _ in range(petals):
        draw_petal(t)
        t.left(360 / petals)

def main():
    window = turtle.Screen()
    window.bgcolor("lightblue")
    
    t = turtle.Turtle()
    t.color("red")
    t.speed(10)
    
    draw_flower(t, 10)
    
    t.hideturtle()
    
    window.mainloop()
    

    