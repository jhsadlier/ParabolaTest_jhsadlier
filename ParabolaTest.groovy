return [ Parabola.extrudeByEquation(5,0.27,0,5)
	.move(20,0,0),
	Parabola.coneByEquation(5,1.27,0.7)
	.move(30,0,0),
	Parabola.coneByHeight(10, 50)
		.move(50,0,0)
]