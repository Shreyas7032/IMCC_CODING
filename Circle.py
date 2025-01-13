import math
class Circle:
    _radius=0.0
    area=0.0
    
    def __init__(self,rd):
        # call the setter for radius here
        self.setRadius(rd)
        
    def setRadius(self,rd):
        Circle._radius=rd
        print('Radius value is set using setter')
        
    def getRadius(self):
        return self._radius
    
    def Cal_Area(self):
        self.area=math.pi*self.getRadius()*self.getRadius()
        
        
    
    

    
           
        
 
        
        