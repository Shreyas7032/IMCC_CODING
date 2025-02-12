<?php
$rad=$_POST['rad'];
$height=$_POST['height'];
define('pi=3.14');
interface shape
{
	public function area();
	public function volume();
}
class cylinder implements shape
{
	private $rad;
	private $height;
	public function __construct($rad,$height)
	{
		$this->rad=$rad;
		$this->height=$height;
	}
	public function volume()
	{
		return pi*$this->rad*$this->rad*$this->height;
	}
}
$cylinder=new cylinder($rad,$height);
echo "Volume of Cylinder=".$cylinder->volume();
?>