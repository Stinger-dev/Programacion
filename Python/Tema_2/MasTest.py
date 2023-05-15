import pygame

# Inicialización del juego y la ventana
pygame.init()
width, height = 480, 480
screen = pygame.display.set_mode((width, height))
clock = pygame.time.Clock()

# Definición de colores
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
GRAY = (128, 128, 128)

# Definición del tamaño y posición de los cuadrados del tablero
square_size = width // 8
board_offset = (width - square_size * 8) // 2

# Tablero inicial del ajedrez
board = [
    ['r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
    ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R']
]

# Bucle principal del juego
running = True
while running:
    # Manejo de eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Dibujado del tablero
    for row in range(8):
        for col in range(8):
            square_color = WHITE if (row + col) % 2 == 0 else BLACK
            pygame.draw.rect(screen, square_color, (col * square_size + board_offset, row * square_size, square_size, square_size))
            piece = board[row][col]
            if piece != ' ':
                piece_color = WHITE if piece.isupper() else BLACK
                piece_image = pygame.image.load(f'pieces/{piece.lower()}.png')  # Asegúrate de tener imágenes de las piezas en una carpeta llamada "pieces"
                piece_image = pygame.transform.scale(piece_image, (square_size, square_size))
                screen.blit(piece_image, (col * square_size + board_offset, row * square_size))

    pygame.display.flip()
    clock.tick(60)

# Finalización del juego
pygame.quit()
