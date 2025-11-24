import 'package:flutter/material.dart';

class LikeButton extends StatefulWidget {
  final bool initialValue;
  final VoidCallback onToggle;

  LikeButton({required this.initialValue, required this.onToggle});

  @override
  _LikeButtonState createState() => _LikeButtonState();
}

class _LikeButtonState extends State<LikeButton> {
  late bool isLiked;

  @override
  void initState() {
    super.initState();
    isLiked = widget.initialValue;
  }

  @override
  Widget build(BuildContext context) {
    return IconButton(
      iconSize: 28,
      color: isLiked ? Colors.red : Colors.grey,
      icon: Icon(isLiked ? Icons.favorite : Icons.favorite_border),
      onPressed: () {
        setState(() => isLiked = !isLiked);
        widget.onToggle();
      },
    );
  }
}
