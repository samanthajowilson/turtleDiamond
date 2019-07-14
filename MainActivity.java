function drawStep(){
  moveForward();
  turnLeft();
  moveForward();
  right();
}

function right(){
  turnLeft();
  turnLeft();
  turnLeft();
}
function drawSide(){
  drawStep();
  drawStep();
  drawStep();
  moveForward();
  right();
}
function drawDiamond(){
drawSide();
drawSide();
drawSide();
drawSide();
}
drawDiamond();
