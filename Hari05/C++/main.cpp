#include <SFML/Graphics.hpp>

int main() {
	sf::RenderWindow window(sf::VideoMode(800, 600),"Contoh grafik dengan SFML");
	
	//membuat lingkaran
	sf::CircleShape circle(50);
	circle.setFillColor(sf::Color::Green);
	circle.setPosition(100, 100);
	
	//mengatur kecepatan pergerakan
	float speed = 0.1;
	
	//cuma looping aja
	while (window.isOpen()){
		sf::Event event;
		while (window.pollEvent(event)){
			if (event.type == sf::Event::Closed)
				window.close();
		}
	
	circle.move(speed, 0);
	
	window.clear(sf::Color::Black);
	
	window.draw(circle);
	
	window.display();
	}
	return 0;
}
