package Arrays

object ContainerWithMostWater {
  def maxArea(height: Array[Int]): Int = {
    if (height.length <= 1) return 0
    var maxArea = 0
    var left = 0
    var right = height.length - 1
    while (right > left) {
      maxArea = Math.max(maxArea, (right - left) * Math.min(height(right), height(left)))
      if (height(right) > height(left))
        left = left + 1
      else
        right = right - 1
    }
    maxArea
  }
}
